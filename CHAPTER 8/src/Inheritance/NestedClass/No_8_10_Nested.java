package Inheritance.NestedClass;

class No_8_10_Nested {//it must be public or default both

    private int noOfDoors;

    void repair(){
        tire t = new tire();
    }
    public static class tire{  //nested class can be private , public , protected , default
//if nested car is static then we can not use outer non static properties
        private double width;
        private double pressure;
        private String material;

        public void infalate(){
            //noOfDoors can not use / we ue if nested class is non static
        }
    }
}
