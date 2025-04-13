abstract class Vehicle
{
    String name;
    abstract public String getName (String val);
    public String getName() {
        return "Vehicle name : " + name;
    }
}


public class abstractT {

    static class Car extends Vehicle {

        private String name;
        public Car (String val) {
            name = super.name + " " + val;
        }

        @Override
        public String getName(String val) {
            return "Car name : " + val;
        }

        public String getName(byte[] val) {
            return "Car name : " + val;
        }
    }

    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        System.out.println(obj.getName());
    }// 01. getName () 인수없는거 -> 인수가 없으니 메소드 오버라이딩을 해도, 얘가 호출되는거임 
    // 02. getName (String)
    // 03. getName (byte)
}
