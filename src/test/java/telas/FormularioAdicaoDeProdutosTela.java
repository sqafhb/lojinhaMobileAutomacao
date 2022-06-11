package telas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioAdicaoDeProdutosTela extends BaseTela {

    public FormularioAdicaoDeProdutosTela(WebDriver app) {
        super(app);
    }

    public FormularioAdicaoDeProdutosTela preencherNomeProduto(String produtoNome) {
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoNome);
        return this;
    }

    public FormularioAdicaoDeProdutosTela preencherValorProduto(String valorProduto) {
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(valorProduto);
        return this;
    }

    public FormularioAdicaoDeProdutosTela preencherCoresProduto(String cores) {
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(cores);
        return this;
    }

    public FormularioAdicaoDeProdutosTela submissaoComErro(){
        app.findElement(By.id("com.lojinha:id/saveButton")).click();
        return this;
    }

    public  String obterMensagemDeErro() {
        return capturarToast();
    }
}
