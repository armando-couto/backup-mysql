package backu_mysql;

import java.io.File;  
import java.io.IOException;  
import java.io.Serializable;  

public class BackupBean implements Serializable {  

   private static final long serialVersionUID = 1L;  
  
   public String fazBackup() {   
      String snh = "admin";  
      String banco = "studio";  
      File diretorio = new File("C:/SDO-Backup");  
      if (!diretorio.isDirectory())  
         new File("C:/SDO-Backup").mkdir();  
      try {  
         String comando = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.5\\bin\\mysqldump";  
         //String comando = "C:\\Program Files\\MySQL\\MySQL Server 5.1\\bin\\mysqldump";  
         ProcessBuilder pb = new ProcessBuilder(comando, "--user=root","--password=" + snh, banco,"--result-file=C:\\SDO-Backup\\bkp_" + banco  + ".sql");  
         pb.start();  
      } catch (IOException ex) { 
          System.out.print("Erro ao gravar o backup!!");
      } catch (Exception err) {  
          System.out.print("Erro ao gravar o backup!!"); 
      }  
      /* 
      Long tamanho = new File("D:\\SDO-Backup\\bkp_" + banco + "_" 
            + ano + "_" + mes + "_" + dia + ".sql").length(); 
      if(tamanho > 0) 
          c.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso","Backup criado com sucesso!")); 
      else c.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Arquivo","Arquivo vazio!")); 
      */  
      return null;  
   }  
   
   public static void main(String args[]) {
      String snh = "408867";  
      String banco = "viacredi_fomento";  
      File diretorio = new File("C:/SDO-Backup");  
      if (!diretorio.isDirectory())  
         new File("C:/SDO-Backup").mkdir();  
      try {  
         String comando = "C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\mysqldump";  
         //String comando = "C:\\Program Files\\MySQL\\MySQL Server 5.1\\bin\\mysqldump";  
         ProcessBuilder pb = new ProcessBuilder(comando, "--user=root","--password=" + snh, banco,"--result-file=src\\banco\\bkp_" + banco  + ".sql");  
         pb.start();
      } catch (IOException ex) { 
          System.out.print("Erro ao gravar o backup!!");
      } catch (Exception err) {  
          System.out.print("Erro ao gravar o backup!!"); 
      }
   }
}  