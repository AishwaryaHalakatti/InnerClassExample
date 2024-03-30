
package LocalInnerClassExample;

public class LocalInnerClass {

        private int data=30;//instance variable
        void display(){
            class Local{
                void msg(){
                    System.out.println("This method of innerclass is : "+data);
                }
            }
            Local l=new Local();
            l.msg();
        }
        public static void main(String args[]){
            LocalInnerClass obj=new LocalInnerClass();
            obj.display();
        }
    }
