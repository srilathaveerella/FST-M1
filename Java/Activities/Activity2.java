package activities;
public class Activity2 {
    public static int temp = 0;
    public static void main(String[] args){
        int[] numArr = {10, 77, 10, 54, -11, 10};
        int sum = 30;
        System.out.println(numArr.length);
        for(int i = 0;i< numArr.length;i++){
            if(numArr[i]==10){
                temp = temp+numArr[i];
            }
        }
        System.out.println("temp value" +temp);
        checkCondition();
            }
    public static boolean checkCondition(){
        if(temp == 30)
            return true;
        else
            return false;
    }

}
