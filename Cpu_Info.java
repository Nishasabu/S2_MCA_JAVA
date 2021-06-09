class CPU {
    double price;
   
class Processor{
double cores;
String manufacturer;

void getinfoPro(){
           
 System.out.println("processor core:Intel Core Duo");
 System.out.println("Processor manufacturer:AMD brand");
 
        }
    }

    protected class RAM{

      double memory;
        String manufacturer;

        void getinfoRam(){
            System.out.println("Ram memory configuration: 4Gb");
            System.out.println("RAM manufacturer:Corsair Vengeance LED");
           
        }
    }
}

public class Cpu_Info  {
    public static void main(String[] args) {

      
        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();

        CPU.RAM ram = cpu.new RAM();
       processor.getinfoPro();
       ram.getinfoRam();
    }
}