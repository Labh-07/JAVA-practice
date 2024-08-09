package Inheritance;

class No_8_9_testter {

    public static void main(String[] args) {
        No_8_9_person p1 = new No_8_9_person("labh",19,"001");
        No_8_9_person p2= new No_8_9_person("labh",19,"001");

        No_8_9_person p3 = new No_8_9_person("tanvi",19,"002");

        //for equality of two perosn

//        if(p1 == p2){      //output is not equal to because refrances check hashcode of prsons not data
//            System.out.println("equal");
//        }
//        else{
//            System.out.println("not equal");
//        }

        if(p1.equals(p2)){            //here not equal prints ,because it is define in object class and in obj class it compare the refrances. but why work in string (in string euqals defined seprately)
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

       //to solve we defines equal byself

        /*
        hashcode :
        -> we see that here for equal method we compare each and every property but for big classes which contain lot of proparties in this case we use hashcode
        -> in this we add all object value into one hashcode and now then we compare the hashcode to compare object values
        -> for same value hash code are same / for diffrent some time same hashcode occurs
        -> hashcode in No_8_9_person
        -> if hash codes are diffrent then objects are diffrent , but if hashcodes are same in this case objects are equal or not equal for this we check one by one
         */

    }
}
