# Treinamento_RestAssured
Projeto para treinar conhecimentos com RestAssured
-> Gradle Klotin
-> Junit 5
-> RestAssured
-> Allure Report

API letras de musicas
https://lyricsovh.docs.apiary.io/#reference

-> Lembre de criar um arquivo .properties para que as infomaçoes da rota dos endpoints
src/main/resources/Properties/Lyric_RotaEndpoint.properties

baseUriProducao = https://api.lyrics.ovh
baseUriMock = coloque aqui a rota do mock
basePath = /v1/{ARTIST}/{TITLE}