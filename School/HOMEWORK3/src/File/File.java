package File;

public class File {
    private String name;
    private String type;
    private int size;

    public File(){
        this.name = " ";
        this.type = " ";
        this.size = 0;
    }

    public File(String name, String type, int size){
        this.name = name;
        this.type = type;
        setSize(size);
    
    }

    public File(File otherFile){
        this.name = otherFile.name;
        this.type = otherFile.name;
        this.size = otherFile.size;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        if (size < 0){
            this.size = 0;
        } 
        else {
            this.size = size;
        }
    }
    
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null || getClass() != otherObject.getClass()) return false;
        File file = (File) otherObject;
        return size == file.size && name.equals(file.name) && type.equals(file.type);
    }

    @Override
    public String toString(){
        return "File name: " + name + " File type: " + type + " File size: " + size;
    }
}
