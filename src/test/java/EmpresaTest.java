package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Empresa empresa = new Empresa("12.345.678/0001-90", "Empresa Original", new Endereco("Rua A", 1), "Juiz de Fora");

        Empresa empresaClone = empresa.clone();
        empresaClone.setCnpj("98.765.432/0001-10");
        empresaClone.setRazaoSocial("Empresa Clonada");
        empresaClone.getEndereco().setNumero(2);

        assertEquals("Empresa{cnpj='12.345.678/0001-90', razaoSocial='Empresa Original', endereco=Endereco{logradouro='Rua A', numero=1}, localFundacao='Juiz de Fora'}", empresa.toString());
        assertEquals("Empresa{cnpj='98.765.432/0001-10', razaoSocial='Empresa Clonada', endereco=Endereco{logradouro='Rua A', numero=2}, localFundacao='Juiz de Fora'}", empresaClone.toString());
    }
}
