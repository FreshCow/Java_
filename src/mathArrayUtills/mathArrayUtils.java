package mathArrayUtills;

public class mathArrayUtils {
    
    private mathArrayUtils(){
        //인스턴스 생성 막기
    }
    
    //덧셈
    static int sum(int[] values){
        int result = 0;

        for(int i : values){
            result += i;
        }

        return result;
    }

    //평균
    static double average(int[] values){

        return (double) sum(values) / values.length;
    }
    
    //최소값
    static int min(int[] values){
        int result = values[0];

        for(int i : values){
            result = Math.min(result, i);
        }

        return result;
    }

    //최대값
    static int max(int[] values){
        int result = values[0];

        for(int i : values){
            result = Math.max(result, i);
        }

        return result;
    }

}
