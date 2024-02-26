  puts "Que quiere convertir?"
  puts "1)Milimetros 2)Centimetros 3)Metros 4)Kilometros"
  print "Opcion: "
  opci = gets.chomp.to_i

    case opci
    when 1
      puts "1)Milimetros a centimetros"
      puts "2)Mililmetros a metros"
      puts "3)Milimetros a kilometros"
      print "Opcion: "
      opcion = gets.chomp.to_i
      print "Milimetros: "
      medida = gets.chomp.to_f

      case opcion
      when 1
        medida_final = medida / 10
      when 2
        medida_final = medida / 1000
      when 3
        medida_final = medida / 1000000
      else
        puts "Opcion no valida"
        return
      end

    when 2
      puts "1)Centimetros a milimetros"
      puts "2)Centimetros a metros"
      puts "3)Centimetros a kilometros"
      print "Opcion: "
      opcion = gets.chomp.to_i
      print "Centimetros: "
      medida = gets.chomp.to_f

      case opcion
      when 1
        medida_final = medida * 10
      when 2
        medida_final = medida / 100
      when 3
        medida_final = medida / 100000
      else
        puts "Opcion no valida"
        return
      end

    when 3
      puts "1)Metros a milimetros"
      puts "2)Metros a centimetros"
      puts "3)Metros a kilometros"
      print "Opcion: "
      opcion = gets.chomp.to_i
      print "Metros: "
      medida = gets.chomp.to_f

      case opcion
      when 1
        medida_final = medida * 1000
      when 2
        medida_final = medida * 100
      when 3
        medida_final = medida / 1000
      else
        puts "Opcion no valida"
        return
      end

    when 4
      puts "1)Kilometros a milimetros"
      puts "2)Kilometros a centimetros"
      puts "3)Kilometros a metros"
      print "Opcion: "
      opcion = gets.chomp.to_i
      print "Kilometros: "
      medida = gets.chomp.to_f

      case opcion
      when 1
        medida_final = medida * 1000000
      when 2
        medida_final = medida * 100000
      when 3
        medida_final = medida * 1000
      else
        puts "Opcion no valida"
        return
      end

    else
      puts "Opcion no valida"
      return
    end

    puts "Resultado: #{medida_final}"