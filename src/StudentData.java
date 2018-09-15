public class StudentData {
    int numOfStudents;
    int[] grade;

    int average(int num, int[] grade){
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=grade[i];
        }
        return (sum/num);
    }
    int max(int num, int[] grade){
        int big=0;
        for(int i=0;i<num-1;i++){
            if(grade[i]>grade[i+1])
                big=grade[i];
        }
        return big;
    }
    int min(int num, int[] grade){
        int small=0;
        for(int i=0;i<num-1;i++){
            if(grade[i]<grade[i+1])
            small=grade[i];
        }
        return small;
    }

}
