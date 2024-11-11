package File;
public class File {
    private String name;
    private String type;
    private double size;

    public File() {
        this.name = "Untitled";
        this.type = "txt";
        this.size = 1.0;
    }

    public File(String name, String type, double size) {
        this.name = name;
        this.type = type;
        setSize(size);
    }

    public File(File file) {
        this.name = file.name;
        this.type = file.type;
        this.size = file.size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        File file = (File) obj;
        return Double.compare(file.size, size) == 0 && name.equals(file.name) && type.equals(file.type);
    }

    @Override
    public String toString() {
        return "File [Name: " + name + ", Type: " + type + ", Size: " + size + "MB]";
    }
}
