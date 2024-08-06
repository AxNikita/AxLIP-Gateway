# AxLIP-Gateway

## Запуск

Для того чтобы проект корректно запустился, необходимо выполнить следующие шаги:

1. **Собрать образ**:

    ```bash
    docker build -t ax-lip-gateway-app .
    ```

2. **Запустить контейнер**:

    ```bash
    docker run -it -p 9999:9999 --rm --name ax-lip-gateway-app ax-lip-gateway-app
    ```