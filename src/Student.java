public class Student {

    

    	private String name;
    
	
    	private int test[]= new int[3]; 




      public Student(){
		this("", 0, 0, 0);
	}

	
	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		test[0] = t1;
		test[1] = t2;
		test[2] = t3;
	}

	
	public Student(Student s) {
		this(s.name, s.test[0], s.test[1], s.test[2]);
	}
        
        public Student(String nm, int t[]){
            name = nm;
            for(int x = 0;x < 3;x++){
                test[x]=t[x];
            }
        }

   

    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
    	test[whichmark-1] = number;
    }

    public int getAverage() {
    	int average = (test[0] + test[1] + test[2]) / 3;
    	return average;
    }


    public int getMark(int whichmark) {
	return test[whichmark-1];
    }

    public int getHighscore() {
    	if (test[0] > test[1] && test[0] > test[2]) {
    		return test[0];
    	}
    	else if (test[1] > test[0] && test[1] > test[2]){
    		return test[1];

    	} else {
    		return test[2];
    	}
    }

    public String toString() {
    	String result = "Name: " + name;
    	result += "\nMark 1:\t" + test[0];
    	result += "\nMark 2:\t" + test[1];
    	result += "\nMark 3:\t" + test[2];
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nPlease Enter a name\nRe-enter all data";
    	
	if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100) 
            message += "\nPLease re-enter the data";
	return message;
    	}
 }