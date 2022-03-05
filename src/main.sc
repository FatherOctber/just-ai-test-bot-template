require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: А вот секретик {{ $secrets.get("topSecret", "ии его нет") }}
        a: Другой секретик {{ $secrets.get("test", "ии его нет") }}

    state: Hello
        intent!: /привет
        a: Привет привет все началось

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

