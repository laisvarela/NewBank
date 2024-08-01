package com.mycompany.classes;

import java.io.IOException;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class historico {

    private Titular titular;
    private List<Operacao> operacoes;

    public historico() {
    }

    public boolean registrarOperacao(Titular t, Operacao o) {
        if (this.titular.equals(t)) {
            operacoes.add(o);
            return true;
        } else {
            return false;
        }
    }

    public Operacao pesquisarOperacao(Operacao o) {
        for (Operacao operacao : operacoes) {
            if (operacao.equals(o)) {
                return operacao;
            }
        }
        return null;
    }

    public List<Operacao> pesquisarValores(double valor) {
        return null;
    }

    public void gerarExtratoPDF(String filePath) {
        // Cria um documento PDF
        try (PDDocument document = new PDDocument()) {
            // Adiciona uma página ao documento
            PDPage page = new PDPage();
            document.addPage(page);

            // Cria um fluxo de conteúdo para desenhar na página
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                // Define a fonte e o tamanho do texto
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

                // Adiciona título e informações do titular
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 750);
                contentStream.showText("Extrato de Conta");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Titular: " + titular.getNome());
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Operações realizadas:");
                contentStream.endText();

                // Adiciona as operações
                int yPosition = 700; // Posição inicial para as operações
                for (Operacao operacao : operacoes) {
                    contentStream.beginText();
                    contentStream.newLineAtOffset(100, yPosition);
                    contentStream.showText(operacao.toString());
                    contentStream.endText();
                    yPosition -= 20; // Ajusta a posição para a próxima linha
                }
            }

            // Salva o documento em um arquivo
            document.save(filePath);

            System.out.println("PDF criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
