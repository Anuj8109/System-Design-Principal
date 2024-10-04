package Decorator;

import Decorator.Decorators.CompressionDecorator;
import Decorator.Decorators.DataSourceDecorator;
import Decorator.Decorators.EncryptionDecorator;
import Decorator.Decorators.FileDataSource;
import Decorator.Decorators.DataSource;;

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
