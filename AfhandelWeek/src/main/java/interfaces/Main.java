package interfaces;

public class Main {
    public static void main(String[] args) {

    }
}

interface Readable {
    void read();
}

abstract class File {
   int bytesRead = 0;
   byte[] buffer = new byte[1024];
}

class ReadOnlyFile extends File implements Readable {
    @Override
    public void read() {

    }
}

class ReadWriteFile extends ReadOnlyFile implements Writable {
    @Override
    public void write() {

    }
}

class HttpRequest implements Readable {
    @Override
    public void read() {

    }
}
