package br.com.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    private final Connection conexao;

    public DAO() throws SQLException {
        this.conexao = ConexaoBanco.getConnection();
    }

    //metodo para inserir dados no banco
    public void inserirAnuncios(Anuncio anuncio) {
        String sql = "INSERT INTO trabalholp3 (NomeFantasia, RazaoSocial, CNPJ, Telefone, Email, Endereco, Descricao) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement s = conexao.prepareStatement(sql);
            s.setString(1, anuncio.getNomeFantasia());
            s.setString(2, anuncio.getRazaoSocial());
            s.setString(3, anuncio.getCNPJ());
            s.setString(4, anuncio.getTelefone());
            s.setString(5, anuncio.getEmail());
            s.setString(6, anuncio.getEndereco());
            s.setString(7, anuncio.getDescricao());
            s.execute();
            s.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void removerAnuncios(Anuncio anuncio) {
        try {
            String sql = "DELETE FROM trabalholp3 WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            int t = anuncio.getId();
            stmt.setInt(1, anuncio.getId());
            stmt.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public List<Anuncio> obtemLista() {
        try {
            List<Anuncio> a = new ArrayList<Anuncio>();
            String sql = "SELECT * FROM trabalholp3";
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Anuncio anuncio = new Anuncio();
                anuncio.setId(rs.getInt("id"));
                anuncio.setNomeFantasia(rs.getString("NomeFantasia"));
                anuncio.setRazaoSocial(rs.getString("RazaoSocial"));
                anuncio.setCNPJ(rs.getString("CNPJ"));
                anuncio.setTelefone(rs.getString("Telefone"));
                anuncio.setEmail(rs.getString("Email"));
                anuncio.setEndereco(rs.getString("Endereco"));
                anuncio.setDescricao(rs.getString("Descricao"));

                a.add(anuncio);
            }
            rs.close();
            stmt.close();
            return a;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
