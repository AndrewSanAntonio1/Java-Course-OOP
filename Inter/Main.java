package Inter;

interface Computer {
    void code();
}
class Laptop implements Computer {
    public void code() {
        System.out.println("coding...");
    }
}
class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}
class Developer {
    public void devApp(Computer desk) {
        desk.code();
    }
}

class Main {
    public static void main(String[] args) {
        Computer lap =  new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();
        navin.devApp(desk);
    }
}
