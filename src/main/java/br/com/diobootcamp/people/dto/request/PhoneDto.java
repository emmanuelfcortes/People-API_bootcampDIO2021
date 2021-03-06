package br.com.diobootcamp.people.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.com.diobootcamp.people.enums.PhoneTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PhoneDto {

    private Long id;

    @Valid
    @Enumerated(EnumType.STRING)
    private PhoneTypes type;

    @Valid
    @NotEmpty
    @Size(min = 10, max = 19)
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{2,3}\\))|\\d{2,3})[- .]?\\d{4,5}[- .]?\\d{4}$")
    private String number;
}
