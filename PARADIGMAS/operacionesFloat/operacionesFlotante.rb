 puts "Elija una opcion: 1) suma 2)resta 3)multiplicacion 4)division"
    print "Opcion: "
    opci = gets.chomp.to_i

    print "Ingrese el primer valor: "
    v1 = gets.chomp.to_f

    print "Ingrese el segundo valor: "
    v2 = gets.chomp.to_f

    case opci
    when 1
      suma = v1 + v2
      puts "#{v1} + #{v2} = #{suma}"
    when 2
      resta = v1 - v2
      puts "#{v1} - #{v2} = #{resta}"
    when 3
      multi = v1 * v2
      puts "#{v1} * #{v2} = #{multi}"
    when 4
        divi = v1 / v2
        puts "#{v1} / #{v2} = #{divi}"
    else
      puts "Opcion no valida"
    end