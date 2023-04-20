package Kodlamaio.KodlaWithNlayeredApp.Logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Dosyaya gönderildi : " + data);
    }
}
