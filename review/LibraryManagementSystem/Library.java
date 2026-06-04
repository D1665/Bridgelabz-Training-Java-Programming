package review.LibraryManagementSystem;

class Library {
    private static Library instance;
    
    private Library() {
        System.out.println("object created ");
    }
    public static  Library getInstance() {
        if (instance == null) {
            instance = new Library();}
            return instance;
    }
  
    }
