import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arthur Sudbrack Ibarra
 */
public class Acesso {
    
    private final Desktop desktop;
    
    public String[] info;
    
    public String nomeCad1;
    public String nomeCad2;
    public String nomeCad3;
    public String nomeCad4;
    public String nomeCad5;
    public String nomeCad6;
    public String nomeCad7;
    
    public String linkCad1;
    public String linkCad2;
    public String linkCad3;
    public String linkCad4;
    public String linkCad5;
    public String linkCad6;
    public String linkCad7;
    
    public Acesso() throws IOException{
        desktop = Desktop.getDesktop();
        refrescarDados();       
    }
    
    //Método que abre o link da disciplina no navegador.
    public void executar(String link) throws URISyntaxException, IOException{      
        desktop.browse(new URI(link));  
    }
       
    //Cria ou/e lê arquivo .txt.
    public void refrescarDados() throws IOException{
        
        String dir = System.getProperty("user.dir");
        File file = new File(dir + "/dados-autozoom.txt");
        
        if(!file.exists()) {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.write("Nome da disciplina 1:,Nome da disciplina 2:,Nome da disciplina 3:,Nome da disciplina 4:,Nome da disciplina 5:,"
                    + "Nome da disciplina 6:,Nome da disciplina 7:,Link Zoom da disciplina 1:,Link Zoom da disciplina 2:,"
                    + "Link Zoom da disciplina 3:,Link Zoom da disciplina 4:,Link Zoom da disciplina 5:,"
                    + "Link Zoom da disciplina 6:,Link Zoom da disciplina 7:");
            pw.close();
        }
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        try {
            info = br.readLine().split(",");
        } catch (IOException ex) {
            Logger.getLogger(Acesso.class.getName()).log(Level.SEVERE, null, ex);
        }

        br.close();
        
        nomeCad1 = info[0];
        nomeCad2 = info[1];
        nomeCad3 = info[2];
        nomeCad4 = info[3];
        nomeCad5 = info[4];
        nomeCad6 = info[5];
        nomeCad7 = info[6];
        
        linkCad1 = info[7];
        linkCad2 = info[8];
        linkCad3 = info[9];
        linkCad4 = info[10];
        linkCad5 = info[11];
        linkCad6 = info[12];
        linkCad7 = info[13];
        
    }
}
