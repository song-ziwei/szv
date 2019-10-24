import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

public class yunsuan2 {
  
	private static List<yunsuan> subjectList;
	
	public static List<yunsuan> getSubjectList(){
		return subjectList;
	}
	public void setSubjectList(List<yunsuan> subjectList) {
		this.subjectList=subjectList;
	}
	public yunsuan2() {
		int count=10;                             //定义题目数量
		List<yunsuan> list=new ArrayList<yunsuan>();
		BiFunction<Integer, Integer,Integer> add=(x,y)->x+y;
		BiFunction<Integer, Integer,Integer> minus=(x,y)->x-y;
		BiFunction<Integer, Integer,Integer> multiple=(x,y)->x*y;
		BiFunction<Integer, Integer,Integer> divide=(x,y)->x/y;
		for(int i=0;i<count;i++) {
			yunsuan subject=new yunsuan();
			Integer a=new Random().nextInt(99);   //定义一个随机数a
			Integer b=new Random().nextInt(99);   //定义一个随机数b
			subject.setA(a);
			subject.setB(b);
			subject.setIndex(i+1);
			Integer symbol=new Random().nextInt(3);
			if(symbol==0) {                       //生成符号
				subject.setSymbol("+");
				subject.setResult(add.apply(a, b));
			}else if(symbol==1) {
				subject.setSymbol("-");
				subject.setResult(minus.apply(a, b));
			}else if(symbol==2) {
				subject.setSymbol("*");
				subject.setResult(multiple.apply(a, b));
			}else if(symbol==3) {
			subject.setSymbol("/");
			subject.setResult(divide.apply(a, b));
			}
			list.add(subject);
		}
		this.subjectList=list;
	}
		
		}


