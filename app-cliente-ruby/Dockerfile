FROM ruby:3.1
RUN useradd -ms /bin/bash appuser
USER appuser
WORKDIR /app
COPY . .
RUN bundle install
CMD ["ruby", "main.rb"]