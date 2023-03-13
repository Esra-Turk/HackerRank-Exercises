//problem : https://www.hackerrank.com/challenges/java-priority-queue/problem

import java.util.*;

class Student{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCGPA(){
        return this.cgpa;
    }
}

class Priorities{
    
    private final PriorityQueue<Student> pQueue = new PriorityQueue<>(new Comparator<>(){
        @Override
        public int compare(Student std1, Student std2) {
            int cgpaCompare = Double.compare(std2.getCGPA(), std1.getCGPA());
            int nameCompare = std1.getName().compareTo(std2.getName());
            int idCompare = Integer.compare(std1.getID(), std2.getID());
            
            return (cgpaCompare == 0) ? (nameCompare == 0) ? idCompare: nameCompare : cgpaCompare;
        }
    }); 
   
    List<Student> getStudents(List<String> events){
        
        for(String std: events){
            String[] list = std.split(" ");
            
            if(list[0].equals("ENTER")){
                Student stdn = new Student(Integer.parseInt(list[3]),list[1],Double.parseDouble(list[2]));
                pQueue.add(stdn);
                
            }
            else if(list[0].equals("SERVED")){
                pQueue.poll();  
            }
            
        }
        
        List<Student> studentList = new ArrayList<>();
        while (!pQueue.isEmpty()) {
            studentList.add(pQueue.poll());
        }
        return studentList;
    }
    
}

public class Priorityqueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
