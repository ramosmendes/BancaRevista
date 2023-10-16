#include <stdio.h>

int main() {
    int temperaturas[20];
    int frequencia[20] = {0};
    printf("Digite as temperaturas:\n");
    for (int i = 0; i < 20; i++) {
        scanf("%d", &temperaturas[i]);
        frequencia[i] = -1;
    }
    for (int i = 0; i < 20; i++) {
        int temp = temperaturas[i];
        int cont = 1;
        for (int j = i + 1; j < 20; j++) {
            if (temperaturas[j] == temp) {
                cont++;
                frequencia[j] = 0;
            }
        }
        if (frequencia[i] != 0) {
            frequencia[i] = cont;
        }
    }

    // Bubble
    for (int i = 0; i < 19; i++) {
        for (int j = 0; j < 19 - i; j++) {
            if (frequencia[j] < frequencia[j + 1]) {
                int temp = frequencia[j];
                frequencia[j] = frequencia[j + 1];
                frequencia[j + 1] = temp;
                temp = temperaturas[j];
                temperaturas[j] = temperaturas[j + 1];
                temperaturas[j + 1] = temp;
            }
        }
    }
    printf("\nRELATÓRIO DE FREQUÊNCIA\n");
    printf("=======================\n");
    for (int i = 0; i < 20; i++) {
        if (frequencia[i] > 1) {
            printf("%d - %d VEZES\n", temperaturas[i], frequencia[i]);
        } else if (frequencia[i] == 1) {
            printf("%d - 1 VEZ\n", temperaturas[i]);
        }
    }
    return 0;
}
