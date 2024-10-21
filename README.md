## Стек: 
- Архитектура: 
	- Многомодульность
	- Clean Architecture + MVVM
 - UI: Compose
 - Сеть: 
	- Retrofit для загрузки данных
	- WebSocket с OkHttp для чата
- Навигация: Compose Navigation
- DI: Hilt
- Асинхронность: Coroutine
- Уведомления: Firebase Cloud Messaging


### app
	di - Hilt
	Связь модулей
### navigation
	Compose Navigation
### core
	Общие инструменты
### list_chat
	Presentation
		Compose + ViewModel
	Domain
		use_cases
			getList()
			goToChat()
			...
### chat
	Presentation
		Compose + ViewModel
	Domain
		use_cases
			getMessages()
			...
### notifications
	обработка FCM сообщений
### websocket
	OkHttp
### network
	Retrofit
