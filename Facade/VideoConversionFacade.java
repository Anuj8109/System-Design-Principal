package SystemDesign.Facade;

import java.io.File;

import SystemDesign.Facade.complex_media_library.AudioMixer;
import SystemDesign.Facade.complex_media_library.BitrateReader;
import SystemDesign.Facade.complex_media_library.Codec;
import SystemDesign.Facade.complex_media_library.CodecFactory;
import SystemDesign.Facade.complex_media_library.MPEG4CompressionCodec;
import SystemDesign.Facade.complex_media_library.OggCompressionCodec;
import SystemDesign.Facade.complex_media_library.VideoFile;

public class VideoConversionFacade {
    
    public File convertVideo(String filename, String format){
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if(format.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        }else{
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
