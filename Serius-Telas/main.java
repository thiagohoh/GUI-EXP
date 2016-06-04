

/**
 * Created by Thiago on 02/06/2016.
 */
public class main {
    public static void main(String[] args) {
    Test l = new Test();

        l.setVisible(true);
        int k ;
        for(k = -120;k  <= 1000;k++){

            k++;
            l.cred.setLocation(k,1);
            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }


            if(k == 999){
                k = -120;
            }
        }


    }


}
