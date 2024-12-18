package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class EventData(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    EventData(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    EventData(
        id = 2,
        title = "Hackathon Global",
        description = "Desenvolvedores criando soluções para o futuro.",
        date = "2024-12-20",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    EventData(
        id = 3,
        title = "Festival de Inovação",
        description = "Palestras e workshops sobre inovação e empreendedorismo.",
        date = "2025-01-10",
        location = "Auditório Inova",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    EventData(
        id = 4,
        title = "Feira de Robótica",
        description = "Exposição de projetos e competições de robôs.",
        date = "2025-01-25",
        location = "Pavilhão de Exposições",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    EventData(
        id = 5,
        title = "Maratona de Programação",
        description = "Competição de programação com equipes de todo o país.",
        date = "2025-02-05",
        location = "Campus Universitário",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    EventData(
        id = 6,
        title = "Semana da Sustentabilidade",
        description = "Discussão sobre tecnologias sustentáveis e práticas ecológicas.",
        date = "2025-03-15",
        location = "EcoParque",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    EventData(
        id = 7,
        title = "Simpósio de Inteligência Artificial",
        description = "Exploração dos avanços em inteligência artificial e aprendizado de máquina.",
        date = "2025-03-22",
        location = "Hotel Internacional",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    EventData(
        id = 8,
        title = "Encontro de Startups",
        description = "Oportunidade de networking para empreendedores.",
        date = "2025-04-10",
        location = "Espaço Startup",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    EventData(
        id = 9,
        title = "Workshop de Desenvolvimento Mobile",
        description = "Aprenda as melhores práticas para criar aplicativos móveis.",
        date = "2025-04-25",
        location = "Laboratório Tech",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    EventData(
        id = 10,
        title = "Congresso de Cibersegurança",
        description = "Tópicos como segurança de dados e privacidade.",
        date = "2025-05-05",
        location = "Centro de Eventos Digitais",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img10
    )
)
