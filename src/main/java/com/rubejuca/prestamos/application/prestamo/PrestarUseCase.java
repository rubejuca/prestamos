package com.rubejuca.prestamos.application.prestamo;

import com.rubejuca.prestamos.domain.cliente.model.ClienteId;
import com.rubejuca.prestamos.domain.prestamo.model.NumeroLibranza;
import com.rubejuca.prestamos.domain.prestamo.model.PrestamoId;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Slf4j
@Service
public class PrestarUseCase {

  @Builder
  public record Request(
      ClienteId clienteId,
      NumeroLibranza numeroLibranza,
      LocalDate fecha,
      BigDecimal capital,
      BigDecimal interes,
      Integer cuotas) {}

  @Builder
  public record Response(
      PrestamoId prestamoId,
      ClienteId clienteId,
      BigDecimal capital,
      Float interes,
      Integer cuotas,
      BigDecimal intereses,
      BigDecimal total) {}


  public Response preview(Request request) {

    BigDecimal total = request.capital
        .multiply(request.interes)
        .divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)
        .multiply(BigDecimal.valueOf(request.cuotas));

    BigDecimal cuota = total.divide(BigDecimal.valueOf(request.cuotas), RoundingMode.HALF_UP);

  }

  public Response confirmar(Request request) {

  }

}
