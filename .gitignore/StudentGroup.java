import java.util.Date;
import java.lang.*;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
           
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		 try{
                if(students==null){
                  throw(new IllegalArgumentException());
                 // return null;
                }
           
            }catch(IllegalArgumentException e){
                 e.message();
            }
            for(int i=0;i<students.length();i++)
               this.students[i]=students[i];
               
               
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int i;
		try{
		      if(index<0||index>students.length()){
		         throw(new IllegalArgumentException());
                 // return null;
                }
         }catch(IllegalArgumentException e){
                 e.message();
         }
         for(i=0;i<students.length();i++){
             if(i==index-1){
                return students[i];
              }     
         }          
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
		      if(index<0||index>students.length()||student==null){
		         throw(new IllegalArgumentException());
                 // return null;
                }
         }catch(IllegalArgumentException e){
                 e.message();
         }
         for(int i=0;i<students.length();i++){
             if(i==index-1){
                 students[i]=student;
              }     
         }          
		//return null;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		 try{
             if(student==null){
               throw(new IllegalArgumentException());
              
             }
        
         }catch(IllegalArgumentException e){
              e.message();
         }
		 if(students==null) {
			 students[0]=student;
		 }
		 else {
			 for(int i=students.length()-1;i>=0;i--) {
				 students[i+1]=students[i];
			 }
			 students[0]=student;
		 }
		 
	}

	@Override
	public void addLast(Student student){
		// Add your implementation here
		try{
            if(student==null){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
        }
		 if(students==null) {
			 students[0]=student;
		 }
		 else {
			students[students.length()]=student;
		 }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		 try{
			 if(index<0||index>students.length()||student==null){
               throw(new IllegalArgumentException());
              
             }
        
         }catch(IllegalArgumentException e){
              e.message();
         }
		 if(students==null) {
			 students[0]=student;
		 }
		 else {
			 for(int i=students.length()-1;i>index;i--) {
				 students[i+1]=students[i];
			 }
			 students[index-1]=student;
		 }
		 
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		 try{
			 if(index<0||index>students.length()){
               throw(new IllegalArgumentException());
              
             }
        
         }catch(IllegalArgumentException e){
              e.message();
         }
	
			 for(int i=index-1;i<students.length();i++) {
				 students[i]=students[i+1];
			 }
			
		 }
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		boolean flag=0;
		try{
            if(student==null){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
        }
		for(i=0;i<students.length();i++) {
		     if(students[i]==student) {
                 flag=1;
				 for(int j=i;j<students.length();j++) {
					 students[j]=students[j+1];
				 }
		     }
		     else {
		    	 flag=0;
		     } 	 
		}
		try{
            if(flag==0){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message("Student not exist");
        }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try{
			 if(index<0||index>students.length()){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
        }
		for(int i=index;i<students.length();i++) {
			students[i]=null;
		}		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try{
            if(student==null){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
        }
		for(int i=0;i<students.length();i++) {
			if(students[i]==student) {
				for(int j=i;j<students.length();j++) {
					students[j]=null;
				}
			}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try{
			 if(index<0||index>students.length()){
             throw(new IllegalArgumentException());
            
           }
      
       }catch(IllegalArgumentException e){
            e.message();
       }
		for(int i=0;i<index;i++) {
			students[i]=null;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try{
            if(student==null){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
        }
		for(int i=0;i<students.length();i++) {
			if(students[i]==student) {
				for(int j=0;j<i;j++) {
					students[j]=null;
				}
			}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		for(i=0;i<students.length();i++) {
			for(j=i+1;j<students.length();j++) {
				if(students[i].getId()>students[j].getId()) {
					Student t=students[i];
					students[i]=students[j];
					students[j]=t;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student[] a;
		int i,k=0;
		boolean flag=0;
		try {
			if(date==null) {
				
				throw(new IllegalArgumentException());
	             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
		}
		for(i=0;i<students.length();i++) {
			if((students[i].getBirthDate()).before(date)) {
				a[k]=students[i];
				flag=1;
				k++;
			}
			
		}
		if(flag==1)
		return a;
		
			return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		Student[] a;
		int i,k=0;
		boolean flag=0;
		try {
			if(firstDate==null||lastDate==null) {
				
				throw(new IllegalArgumentException());
	             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
		}
		for(i=0;i<students.length();i++) {
			if((students[i].getBirthDate()).before(lastDate)&&(students[i].getBirthDate()).after(firstDate)) {
				a[k]=students[i];
				k++;
				flag=1;
			}
			
		}
		if(flag==1)
		return a;
		
			return null;
	}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try {
			if(indexOfStudent==null) {
				
				throw(new IllegalArgumentException());
	             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
		}
		int age=2017-(students[indexOfStudent].getBirthDate().getYear());
		return age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Student a[];
		int k=0;
		boolean flag=0;
		for(int i=0;i<students.length();i++) {
			if(getCurrentAgeByDate(i)==age) {
				a[k]=students[i];
				k++;
				flag=1;
			}
		}
		if(flag==1)
			return a;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Student[] a;int k=0;boolean flag=0;
		int max=students[0].getAvgMark();
		for(int i=1;i<students.length();i++) {
			if(students[i].getAvgMark()>=max) {
				max=students[i].getAvgMark();
			}
		}
		for(i=0;i<students.length();i++) {
			if(students[i].getAvgMark()==max) {
				a[k]=students[i];
				k++;
				flag=1;
			}
			
		}
		if(flag=1) {
			return a;
		}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try{
            if(student==null){
              throw(new IllegalArgumentException());
             
            }
       
        }catch(IllegalArgumentException e){
             e.message();
        }
		for(int i=0;i<students.length();i++) {
			if(students[i]==student) {
				return students[i+1];
			}
		}
		return null;
	}
}
