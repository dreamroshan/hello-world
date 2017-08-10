/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.details.using.pkgthis.keyword;

/**
 *
 * @author Roshan
 */
class AddressDetails
{
    int flatno;
    String blgd;
    String city;

AddressDetails(int flatno,String blgd)
 {
    this.flatno = flatno;
    this.blgd = blgd ;
 }
AddressDetails(int flatno,String blgd,String city)
 {
    //now no need to initialize id and name
    this(flatno,blgd);
    this.city =city;
 }
void display()
 {
    System.out.println(flatno + " " + blgd + " " + city);
 }


public class AddressDetailsUsingThisKeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        AddressDetails e1 = new AddressDetails(01, "abc");
        AddressDetails e2 = new AddressDetails(02,"def","mumbai");
        e1.display();
        e2.display();
    }
  }  
}
