puts "Ingrese el radio: "
    radio = gets.chomp.to_f

    longitud = 2 * 3.14159 * radio
    area = 4 * 3.14159 * (radio * radio)
    volumen = (((radio * radio * radio) * 4) / 3) * 3.14159

    puts "Longitud de la circunferencia: #{longitud} unidades."
    puts "Area de la circunferencia: #{area} unidades^2."
    puts "Volumen de la esfera: #{volumen} unidades^3."