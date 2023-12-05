<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="styles.css"> <!-- Adicionando arquivo de estilos personalizados -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

    <title>KR9 Informática</title>
   
   
   
   
   
   
   
    <style >
    
    
    
    .gallery__item:hover {
  transform: scale(1.1);
  transition: transform 0.3s ease-in-out;
  cursor: pointer;
}
    
    
    
    
    </style>
    
    
    
    

    
    <style>
 
 
 
 
 
 
 
 
    /*imagem antes das fotos*/
 
 
    .centered-image {
        display: block;
        margin: 0 auto;
        max-width: 30%;
        height: auto;
        
    }
    
    
    
    
    
    
</style>
       /*galeria*/
 
<style>

 @charset "UTF-8";
    .gallery {
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        grid-gap: 20px;
    }

    .gallery__item {
        overflow: hidden;
        border-radius: 10px;
        position: relative;
        cursor: pointer;
    }

    .gallery__img {
        width: 100%;
        height: 100%;
        object-fit: cover;
        transition: transform 0.3s ease;
    }

    .gallery__item:hover .gallery__img {
        transform: scale(1.1);
    }

    .lightbox {
        display: none;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: rgba(0, 0, 0, 0.8);
        justify-content: center;
        align-items: center;
        z-index: 2;
    }

    .lightbox img {
        max-width: 80%;
        max-height: 80%;
    }
</style>
    
    
    <style>
    
    
     @charset "UTF-8";
    
    
    
    
    
        body {
            margin: 0;
            padding: 0;
            background-image: url('https://i.imgur.com/laX2E5U.png');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            height: 100vh;
        }

        .carousel {
            width: 100%;
            margin: 0 auto;
            max-width: 1500px;
        }

        .carousel img {
            width: 100%;
            height: auto;
        }

        .fixed-buttons {
            position: fixed;
            top: 20px;
            left: 20px;
            z-index: 1;
        }

        .fixed-buttons .btn-img {
            background-color: transparent;
            border: none;
            padding: 0;
        }

        nav .nav-wrapper {
            background-color: #000000;
        }

    .button-container {
    display: flex;
    justify-content: center;
    margin-top: 20px;
}

.custom-btn {
    width: 280px;
    height: 40px;
    color: #fff;
    border-radius: 50px;
    padding: 0;
    font-family: 'Lato', sans-serif;
    font-weight: 200;
    background: transparent;
    cursor: pointer;
    transition: all 0.3s ease;
    position: relative;
    box-shadow: inset 2px 2px 2px 0px rgba(255, 255, 255, .5),
        7px 7px 20px 0px rgba(0, 0, 0, .1),
        4px 4px 5px 0px rgba(0, 0, 0, .1);
    outline: none;
    text-align: center;
    line-height: 40px;
    margin: 0 5px;
}


        /* Gradiente para o botão */
        .btn-1 {
            background: rgb(6, 14, 131);
            background: linear-gradient(0deg, rgba(6, 14, 131, 1) 0%, rgba(12, 25, 180, 1) 100%);
            border: none;
        }

        /* Gradiente hover para o botão */
        .btn-1:hover {
            background: rgb(0, 3, 255);
            background: linear-gradient(0deg, rgba(0, 3, 255, 1) 0%, rgba(2, 126, 251, 1) 100%);
        }
/* Conteúdo do colapso */
.expanded-content {
    width: 700px;
    max-height: 1000px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    /* Adicione position: absolute */
    position: absolute;
    /* Ajuste a posição conforme necessário */
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}


.custom-collapse {
    /* Remova position: fixed */
    position: absolute;
    width: 35%;
    height: 1000px;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: rgba(0, 0, 0, 0.5);
}




    </style>

    <link href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet">
</head>

<body class="background-image">

    <div class="fixed-buttons">
        <button type="button" class="btn btn-img"
            onclick="window.open('https://www.facebook.com/profile.php?id=61553682487326', '_blank')">
            <img src="https://i.imgur.com/eciK6eU.png" alt="Facebook" width="30" height="30">
        </button>
        <button type="button" class="btn btn-img"
            onclick="window.open('https://wa.me/5519981987162', '_blank')">
            <img src="https://i.imgur.com/mV2UGjK.png" alt="WhatsApp" width="30" height="30">
        </button>
        <button type="button" class="btn btn-img"
            onclick="window.open('https://www.instagram.com/kr9oficial/', '_blank')">
            <img src="https://i.imgur.com/OWdUupI.png" alt="Instagram" width="30" height="30">
        </button>
    </div>

    <nav>
        <div class="nav-wrapper">
            <a href="#" class="brand-logo right">
                <img src="https://i.imgur.com/qVKB42l.png" alt="Logo" style="height: 70px; width: auto;">
            </a>
            <ul id="nav-mobile" class="left hide-on-med-and-down"></ul>
        </div>
    </nav>

    <div class="collapse" id="navbarToggleExternalContent">
        <div class="bg-dark p-4">
            <h5 class="text-white h4"></h5>
            <span class="text-muted"></span>
        </div>
    </div>

    <div class="carousel">
        <div><img src="https://i.imgur.com/CfGD5WJ.jpg"></div>
        <div><img src="https://i.imgur.com/fA2EFFT.jpg"></div>
        <div><img src="https://i.imgur.com/m9G2H5Z.jpg"></div>
        <div><img src="https://i.imgur.com/dFmmRSf.jpg"></div>
        <div><img src="https://i.imgur.com/xyoXbLH.jpg"></div>
        <div><img src="https://i.imgur.com/yiwCCeJ.jpg"></div>
        <div><img src="https://i.imgur.com/C6ihiuN.jpg"></div>
        <div><img src="https://i.imgur.com/ZtXOoE8.jpg"></div>
    </div>

    <!-- Botões "Read More" -->
    <header>
        <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet">
    </header>

 <div class="button-container">
    <button class="custom-btn btn-1" type="button" data-bs-toggle="collapse"
            data-bs-target="#collapseWhoWeAre" aria-expanded="false" aria-controls="collapseWhoWeAre">
        Quem Somos
    </button>
    <button class="custom-btn btn-1" type="button" data-bs-toggle="collapse"
            data-bs-target="#collapseOurServices" aria-expanded="false" aria-controls="collapseOurServices">
        Reparos de Placa Mãe
    </button>
    <button class="custom-btn btn-1" type="button" data-bs-toggle="collapse"
            data-bs-target="#collapseOurServices2" aria-expanded="false" aria-controls="collapseOurServices">
        Computadores de Alto Desempenho
    </button>
    <button class="custom-btn btn-1" type="button" data-bs-toggle="collapse"
            data-bs-target="#collapseOurServices3" aria-expanded="false" aria-controls="collapseOurServices">
        Assistência Técnica especializada
    </button>
</div>


    <!-- Conteúdo "Quem Somos" -->
    <div style="min-height: 120px;">
    <div class="collapse expanded-content custom-collapse" id="collapseWhoWeAre">
            <div class="card card-body">
                <img src="https://i.imgur.com/v34zMhW.png" alt="Descrição da Imagem">
               
               
               
                Bem-vindo à KR9 Informática, onde nossa história é impulsionada pela paixão pela tecnologia e dedicação
                aos clientes. Fundada em Limeira-SP por Rodrigo Ortolani e Kaena Stahl, nossa jornada começou com foco
                em computadores e notebooks básicos.

                O ponto de virada ocorreu quando nosso amigo de infância, Anderson Pagani, investiu em computadores
                para jogos, resultando em um sucesso de vendas que nos permitiu atender todo o interior paulista. Em
                2020, diante da pandemia de COVID-19, transformamos desafios em oportunidades, convidando Anderson para
                se juntar a nós como sócio e inaugurando nossa primeira loja física.

                O que começou de maneira informal evoluiu para uma das primeiras lojas especializadas em computadores
                de alto desempenho na cidade. Na KR9 Informática, dedicamo-nos continuamente a fornecer soluções
                tecnológicas de qualidade, buscando superar expectativas e criar experiências de compra excepcionais.

                Agradecemos a confiança de nossos clientes e parceiros ao longo dessa jornada. Na KR9 Informática,
                construímos relações duradouras baseadas em confiança, transparência e excelência. Junte-se a nós na
                busca pela excelência tecnológica - estamos constantemente evoluindo para melhor atendê-lo.
            </div>
        </div>
    </div>

    <!-- Conteúdo "Nossos Serviços" -->
    <div style="min-height: 120px;">
    <div class="collapse expanded-content custom-collapse" id="collapseOurServices">
            <div class="card card-body">
                <img src="https://i.imgur.com/CfGD5WJ.jpg" alt="Descrição da Imagem">
                <!-- Adicione a imagem e a descrição apropriada para seus serviços -->

                Na KR9 Informática, não somos apenas uma opção, somos a solução exclusiva para o reparo de placa mãe
                na cidade. Destacamo-nos como os especialistas líderes, oferecendo serviços de alta qualidade e
                eficiência incomparável para resolver qualquer problema na placa mãe do seu notebook. Conte conosco
                para um serviço que vai além das expectativas.
            </div>
        </div>
    </div>

    <div style="min-height: 120px;">
    <div class="collapse expanded-content custom-collapse" id="collapseOurServices2">
            <div class="card card-body">
                <img src="https://i.imgur.com/jtczi7V.jpg" alt="">
                <!-- Adicione a imagem e a descrição apropriada para seus serviços -->

                Na KR9 Informática, mergulhamos no universo dos computadores de alto desempenho, moldando a
                experiência para os amantes de jogos e profissionais que enfrentam tarefas intensivas. Somos
                pioneiros na região ao adotar os renomados processadores Intel Xeon, inicialmente concebidos para
                servidores, agora redefinindo o cenário para jogos e trabalhos multitarefa que demandam uma
                profusão de telas e abas.

                Desde computadores gamers de entrada até os mais avançados, nossa missão vai além de vender
                máquinas. Na KR9, não comercializamos apenas computadores; vendemos sonhos. Cada equipamento é um
                portal para o desempenho otimizado, uma expressão de inovação adaptada para elevar suas experiências
                de jogo e trabalho a novas alturas. Desperte para um futuro onde seus sonhos tecnológicos se tornam
                realidade
            </div>
        </div>
    </div>

    <div style="min-height: 120px;">
    <div class="collapse expanded-content custom-collapse" id="collapseOurServices3">
            <div class="card card-body">
                <img src="https://i.imgur.com/yiwCCeJ.jpg" alt="">
                <!-- Adicione a imagem e a descrição apropriada para seus serviços -->

                Na KR9 Informática, não apenas trabalhamos com computadores de alto desempenho, mas também cuidamos
                da saúde e longevidade do seu equipamento atual.

                Oferecemos uma gama completa de serviços, incluindo formatação com e sem backup, manutenção em
                computadores e notebooks, limpeza química e troca de pasta térmica. Tudo projetado para garantir um
                funcionamento eficiente e confiável para lidar com suas tarefas mais desafiadoras. Nossa abordagem
                destaca-se pela qualidade, honestidade e integridade em cada serviço prestado.

                Além disso, proporcionamos flexibilidade com opções adaptadas às suas necessidades específicas. Na
                KR9 Informática, cuidamos do seu equipamento com a dedicação que ele merece.
            </div>
        </div>
    </div>
    
    
    
    
    
    
    
    
<img src="https://i.imgur.com/ARssGS9.png" alt="Descrição da Imagem" class="centered-image gallery__item" style="margin-top: -100px;">

<div class="gallery">
    <figure class="gallery__item">
        <img src="https://i.imgur.com/DjA3KlU.jpg" class="gallery__img" alt="Image 1">
    </figure>
    <figure class="gallery__item">
        <img src="https://i.imgur.com/GEf3CSs.jpg" class="gallery__img" alt="Image 2">
    </figure>
    <figure class="gallery__item">
        <img src="https://i.imgur.com/DcVhJM6.jpg" class="gallery__img" alt="Image 3">
    </figure>
    <figure class="gallery__item">
        <img src="https://i.imgur.com/BJypyzM.jpg" class="gallery__img" alt="Image 4">
    </figure>
    <figure class="gallery__item">
        <img src="https://i.imgur.com/NOkvuzI.jpg" class="gallery__img" alt="Image 5">
    </figure>
    <figure class="gallery__item">
        <img src="https://i.imgur.com/pN1JkXa.png" class="gallery__img" alt="Image 6">
    </figure>
</div>

<div class="lightbox" id="lightbox">
    <img src="" alt="Image">
</div>

<script>
    document.addEventListener('DOMContentLoaded', function () {
        const galleryItems = document.querySelectorAll('.gallery__item');
        const lightbox = document.getElementById('lightbox');
        const lightboxImage = lightbox.querySelector('img');

        galleryItems.forEach(item => {
            item.addEventListener('click', () => {
                const imgSrc = item.querySelector('.gallery__img').src;
                lightboxImage.src = imgSrc;
                lightbox.style.display = 'flex';
            });
        });

        lightbox.addEventListener('click', () => {
            lightbox.style.display = 'none';
        });
    });
</script>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

<script>
    $(document).ready(function () {
        $('.carousel').slick({
            dots: true,
            infinite: true,
            slidesToShow: 4,
            slidesToScroll: 4,
            autoplay: true,
            autoplaySpeed: 2000
        });

        // Materialize initialization
        M.AutoInit();
    });

    document.addEventListener('DOMContentLoaded', function () {
        document.addEventListener('click', function (event) {
            if (!event.target.closest('.expanded-content') && !event.target.closest('.custom-btn')) {
                var expandedContents = document.querySelectorAll('.expanded-content');
                expandedContents.forEach(function (content) {
                    content.classList.remove('show');
                });
            }
        });

        var buttons = document.querySelectorAll('.custom-btn');
        buttons.forEach(function (button) {
            button.addEventListener('click', function () {
                var targetId = this.getAttribute('data-bs-target').substring(1);
                var targetContent = document.getElementById(targetId);

                var expandedContents = document.querySelectorAll('.expanded-content');
                expandedContents.forEach(function (content) {
                    if (content !== targetContent) {
                        content.classList.remove('show');
                    }
                });

                targetContent.classList.toggle('show');
            });
        });
    });
</script>
