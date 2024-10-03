package SystemDesign.Decorator;

import SystemDesign.Decorator.Decorators.CompressionDecorator;
import SystemDesign.Decorator.Decorators.DataSourceDecorator;
import SystemDesign.Decorator.Decorators.EncryptionDecorator;
import SystemDesign.Decorator.Decorators.FileDataSource;
import SystemDesign.Decorator.Decorators.DataSource;;

public class Demo {
    public static void main(String[] args){
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("test.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("test.txt");
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
