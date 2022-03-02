require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём c {{ $secrets.get("topSecret", "kek") }}  пожалуй вот так

    state: Hello
        intent!: /привет
        a: Привет привет все началось

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

