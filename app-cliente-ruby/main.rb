require 'pg'
require 'securerandom'

puts "Cliente Ruby by Harold Adrian"

db_url = "postgresql://postgres:postgres@localhost:5432/postgres"

begin
  conn = PG.connect(db_url)

  loop do
    wait_time = SecureRandom.random_number(10) + 1 # Espera aleatoria entre 1 y 10 segundos
    sleep(wait_time)

    result = conn.exec("SELECT id, name FROM public.dummy")

    result.each do |row|
      puts "Ruby Resultado: #{row['id']} #{row['name']}"
    end
  end
rescue PG::Error => e
  puts e.message
ensure
  conn&.close
end