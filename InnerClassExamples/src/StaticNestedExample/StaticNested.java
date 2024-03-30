
package StaticNestedExample;

import LocalInnerClassExample.LocalInnerClass;

 class Staticnested {
   static int data=45;//instance variable

       static  class Inner {
           void display() {
               System.out.println("Static nested data is :"+data);
           }

       }
 }

