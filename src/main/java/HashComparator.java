public class HashComparator {
    public void compare(String[] file1, String[] file2) {
        for(int i=0; i<file1.length; i++) {
            if(file1[i].equals(file2[i])) {
                System.out.println("Хеш-коды блока " + (i+1) + "совпадают");
            } else {
                System.out.println("Хеш-коды блока " + (i+1) + " НЕ совпадают");
            }
        }
    }
}
