package Quiz;

public class twoArray {public static void main(String[] args) {
    int lotto5[] = new int[6];
    int lotto6[] = new int[6];
    int lotto7[] = new int[6];
    int count = 0;

    for (int i = 0; i < 6; i++) {
        int rnd = (int)((Math.random()*6)+1);
        lotto5[i] = rnd;
        lotto6[i] = rnd;
    }

    for(int i= 0 ; i<6;i++){
        for (int j = 0 ; j<6;j++){
            if(lotto5[i]==lotto6[j]){
                count++;
                while(true){
                    if(count>0){
                        for (int z=0 ; z<6; z++){
                            if(lotto5[i]==lotto6[z]){
                                lotto5[i]= (int)((Math.random()*6)+1);
                            }else{
                                System.out.println(lotto5[i]+" "+"");
                            }
                        }
                    }

                }
            }
        }
    }


    }
}
