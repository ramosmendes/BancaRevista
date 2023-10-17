#include <stdio.h>

int main() {
    int linhas, colunas;
    
    printf("Número de linhas: ");
    scanf("%d", &linhas);

    printf("Número de colunas: ");
    scanf("%d", &colunas);

    if (linhas > 1080 || colunas > 1920) {
        printf("Error! Valor excedido.\n");
        return 1;
    }

    int matriz_original[linhas][colunas];
    int matriz_inversa[linhas][colunas];

    printf("Valores digitados para a matriz (por linha):\n");
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            scanf("%d", &matriz_original[i][j]);
            // Verifica se o valor está dentro do intervalo permitido
            if (matriz_original[i][j] < 0 || matriz_original[i][j] > 255) {
                printf("Valor fora do intervalo permitido.\n");
                return 1;
            }
        }
    }

    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            matriz_inversa[i][j] = 255 - matriz_original[i][j];
        }
    }

    // Exibe a matriz original
    printf("Matriz da imagem original (digitada):\n");
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            printf("%3d ", matriz_original[i][j]);
        }
        printf("\n");
    }

    printf("Matriz da imagem invertida (gerada pelo programa):\n");
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            printf("%3d ", matriz_inversa[i][j]);
        }
        printf("\n");
    }

    return 0;
}
