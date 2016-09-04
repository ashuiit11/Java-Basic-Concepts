import java.util.HashMap;
import java.util.Map;

class DoCalculate{

	public String check(int[] arrayInput , int number){
		int max = number;
		for(int i=0; i<arrayInput.length; i++){
			if(max < arrayInput[i])
				max = arrayInput[i];
		}
		
		Map<Integer,Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i=0; i<max;i++){
			map.put(i,false);
		}
		
		for (int i=0; i<arrayInput.length; i++)
        {
            int key = number-arrayInput[i];
            
            if (key>=0 && map.get(key))
            {
                return String.format( "%s , %s",arrayInput[i], key);
            }
            map.put(arrayInput[i], true);
        }
        return "not found";

	}
}

public class Test{

	public static void main(String[] args){
		int number = 44;
		int[] array = {6,7,9,4,3,8,1};
		DoCalculate calculate = new DoCalculate();
		String result = calculate.check(array, number);
		System.out.println(result);
	}
}