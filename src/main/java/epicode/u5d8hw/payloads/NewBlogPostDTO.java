package epicode.u5d8hw.payloads;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record NewBlogPostDTO(
        @NotBlank(message = "La categoria è obbligatoria")
        @Size(min = 3, max = 50, message = "La categoria deve essere compresa tra 3 e 50 caratteri")
        String category,

        @NotBlank(message = "Il contenuto è obbligatorio")
        @Size(min = 10, message = "Il contenuto deve essere di almeno 10 caratteri")
        String content,

        @Positive(message = "Il tempo di lettura deve essere positivo")
        double readingTime,

        @NotBlank(message = "Il titolo è obbligatorio")
        @Size(min = 3, max = 100, message = "Il titolo deve essere compreso tra 3 e 100 caratteri")
        String title
) {
}
