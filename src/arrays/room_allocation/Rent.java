package arrays.room_allocation;

/**
 * Classe de entidade que representa o aluguel de um quarto (Locatário).
 * O atributo 'room' foi omitido intencionalmente, pois a regra de negócio
 * delega o número do quarto ao próprio índice do array na classe principal,
 * otimizando o uso da memória.
 */
public class Rent {

    private String name;
    private String email;
    
    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // Sobrescrita do método toString para retornar os dados formatados
    @Override
    public String toString() {
        return name + ", " + email;
    }
}