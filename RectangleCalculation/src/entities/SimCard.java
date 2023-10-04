package entities;

import java.util.Arrays;

public class SimCard {

        public int number;
        public String credit;
        public CallList[] list = new CallList[5];



        public SimCard(int number, String credit){
            this.number = number;
            this.credit = credit;

        }


        public void addCall(int numCalled, int timecalled){

            for(int i=0; i<5; i++){
                if(list[i] == null){
                    list[i] = new CallList(numCalled, timecalled);
                    break;
                }
            }
        }


        @Override
        public String toString() {
            return "Sim{" +
                    "number=" + number +
                    ", credit='" + credit + '\'' +
                    ", list=" + Arrays.toString(list) +
                    '}';
        }
    }

