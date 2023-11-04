import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EbooksAdquiridos extends Ebook{
    private LocalDateTime localDateTime;

    public EbooksAdquiridos(String titulo, UsuarioColaborador autor, Editoras editora, LocalDate dataPublicacao, ArrayList<String> generos, double preco, Editoras patrocinio, LocalDateTime localDateTime,double nota, int totalVotos) {
        super(titulo, autor, editora, dataPublicacao, generos, preco, patrocinio,nota, totalVotos);
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}
