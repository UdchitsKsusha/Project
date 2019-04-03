<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Selfie</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/animations.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="js/vendor/modernizr-2.6.2.min.js"></script>
</head>
<body>

<div id="top">
    <!--Authorisation-->
    <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="Login">Вход</h4>
                </div>
                <div class="modal-body">
                    <form action="authorisation" method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" name="email" id="authorisation_email" placeholder="email">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" name="password" id="authorisation_password" placeholder="Пароль">
                        </div>
                        <p class="text-center">
                            <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Войти</button>
                        </p>
                        <p class="text-center">
                            <a href="#" data-toggle="modal" data-target="#register-modal">Регистрация</a>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- Registration-->
    <div class="modal fade" id="register-modal" tabindex="-1" role="dialog" aria-labelledby="Register" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="Register">Регистрация</h4>
                </div>
                <div class="modal-body">
                    <form action="registration" method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" name="name" id="registration_name" placeholder="Имя">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" name="email" id="registration_email" placeholder="email">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" name="password" id="registration_password" placeholder="Пароль">
                        </div>
                        <p class="text-center">
                            <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Зарегистрироваться</button>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="col-md-9" data-animate="fadeInDown">
            <ul class="menu">
                <li><a href="#" data-toggle="modal" data-target="#login-modal">Вход</a>
                </li>
                <li><a href="#" data-toggle="modal" data-target="#register-modal">Регистрация</a>
                </li>
            </ul>
        </div>
    </div>



    <c:forEach items="${authorisationObject}" var="ro">
        <c:if test="${ro.returnString == 'User'}">
            <div class="container">
                <div class="col-md-9" data-animate="fadeInDown">
                    <ul class="menu">
                        <li class="icons__item">
                            <form action="exit" method="post">
                                <input class="log" type="submit" value="Выйти" id="contact_form_submit" name="contact_submit">
                            </form>
                        </li>
                        <li class="icons__item"><a href="#" data-toggle="modal" data-target="#cart-modal"><i class="fa fa-shopping-bag"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="modal fade" id="cart-modal" tabindex="-1" role="dialog" aria-labelledby="Cart" aria-hidden="true">
                <div class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="Cart">Корзина</h4>
                        </div>
                        <div class="modal-body">
                            <c:forEach items="${information}" var="inf">
                                <h4>${inf.serviceEntity.name}</h4>
                                <div class="cart">
                                    <form action="editInformation" method="post">
                                        <input type="hidden" value="${inf.serviceEntity.id}" id="11submit" name="idS" class="theme_btn">
                                        <input type="hidden" value="${inf.id}" id="111submit" name="id" class="theme_btn">
                                        <input class="del" type="submit" value="Изменить" id="1submit" name="contact_submit">
                                    </form>
                                    <form action="deleteInformation" method="post">
                                        <input type="hidden" value="${inf.serviceEntity.id}" id="12submit" name="id" class="theme_btn">
                                        <input class="del" type="submit" value="Удалить" id="2submit" name="contact_submit">
                                    </form>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>

        </c:if>
    </c:forEach>
</div>

<section id="logo" class="light_section">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">
                <a class="navbar-brand" href="index">
                    Selfie<span>салон красоты</span>
                </a>
            </div>
        </div>
    </div>
</section>
<header id="header" class="darkgrey_section">
    <div class="container">
        <div class="row">

            <div class="col-sm-12 mainmenu_wrap">
                <div class="main-menu-icon visible-xs">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                <nav>
                    <ul id="mainmenu" class="menu sf-menu responsive-menu superfish">
                        <li class="">
                            <a href="index">Главная</a>
                        </li>
                        <li class="active">
                            <a href="about">О нас</a>
                        </li>
                        <li class="dropdown">
                            <a href="gallery">Услуги</a>
                            <ul class="dropdown-menu">
                                <li class="">
                                    <a href="nail">Уход за ногтями</a>
                                </li>
                                <li class="">
                                    <a href="hair">Уход за волосами</a>
                                </li>
                                <li class="">
                                    <a href="spa">SPA</a>
                                </li>
                                <li class="">
                                    <a href="kosm">Косметология</a>
                                </li>
                                <li class="">
                                    <a href="depil">Эпиляция/Депиляция</a>
                                </li>
                                <li class="">
                                    <a href="brow">Брови/ресницы</a>
                                </li>
                                <li class="">
                                    <a href="perm">Перманентный макияж</a>
                                </li>
                                <li class="">
                                    <a href="makeup">Макияж и прически</a>
                                </li>
                            </ul>
                        </li>
                        <li class="">
                            <a href="contact">Контакты</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</header>
<section class="grey_section">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">
                <h2 class="block-header">О нас</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12 block">
                <p>Салон красоты «Selfie» – это атмосфера, ради которой сюда каждый день приходят люди совершенно разных интересов, стилей жизни и профессий. Однако всех наших гостей объединяет желание подчеркнуть свою уникальность, выглядеть современно, поддерживать качество жизни на высоком уровне.

                    «Selfie» – это атмосфера, созданная отличными специалистами, призерами престижных международных конкурсов, профессионалами с инновационным подходом. Мы гордимся, что практически все наши сотрудники работают в салоне более 10 лет.

                    В нашей деятельности мы опираемся на такие ценности современного человека, как время, индивидуальность, качество. За время одного посещения мы сумеем совместить несколько процедур (например, маникюр и стрижку) — мы уважаем Ваш график, поэтому можем подстроиться под него. Также обязательно предложим комплекс решений по самостоятельному уходу за собой.

                    Мы гарантируем, что положительный эффект от той или иной услуги, будь то стрижка, окрашивание или уход за телом, сохранится надолго.

                    И, конечно, нам приятно говорить, что за 15 лет своей жизни салон «Selfie» признан не только нашими клиентами, но и международными организациями, жюри премий «Выбор Года» в номинации «Салон красоты класса люкс №1»</p>
            </div>
        </div>
    </div>
</section>
<section id="testimonials" class="color_section parallax gradient">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">

                <div id="carousel-testimonials-fullwidth" class="carousel slide widget_testimonials block">
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-testimonials-fullwidth" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-testimonials-fullwidth" data-slide-to="1"></li>
                        <li data-target="#carousel-testimonials-fullwidth" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active">
                            <h4 class="carousel-introtext">
                                Мы, в первую очередь, акцентируем внимание на Вас: внешние данные, стиль и образ жизни, состояние здоровья, пожелания. Даем рекомендации, чтобы Вы получили лучшее решение.
                            </h4>
                            <p class="carousel-readmore">
                                Ваша личность
                            </p>
                        </div>
                        <div class="item">
                            <h4 class="carousel-introtext">
                                Нам важно, чтобы каждое созданное решение было лучшим для Вас: стрижка, с которой легко справляться дома, или медицнская услуга. Иногда посетители не уверены (или ложно уверены) в том, чего хотят, но наша команда поможет Вам получить гармоничный результат.
                            </h4>
                            <p class="carousel-readmore">
                                Гарантии
                            </p>
                        </div>
                        <div class="item">
                            <h4 class="carousel-introtext">
                                Лучшие косметические линейки и технологии в области красоты, отличные, постоянно развивающиеся специалисты; высокий стандарт оказания услуг.
                            </h4>
                            <p class="carousel-readmore">
                                Качество
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="grey_section">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">
                <h2 class="block-header">Наша команда</h2>
            </div>
        </div>
        <div class="row to_animate_child_blocks">
            <c:forEach items="${masterEntityList}" var="master">
                <div class="block col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src= "${master.image}" alt="team">
                        <div class="caption">
                            <h4>${master.name}</h4>
                            <p>${master.description}</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>

<script src="js/vendor/jquery-1.11.1.min.js"></script>
<script src="js/vendor/jquery-migrate-1.2.1.min.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/vendor/placeholdem.min.js"></script>
<script src="js/vendor/hoverIntent.js"></script>
<script src="js/vendor/superfish.js"></script>
<script src="js/vendor/jquery.actual.min.js"></script>
<script src="js/vendor/jquery.appear.js"></script>
<script src="js/vendor/jquerypp.custom.js"></script>
<script src="js/vendor/jquery.elastislide.js"></script>
<script src="js/vendor/jquery.flexslider-min.js"></script>
<script src="js/vendor/jquery.prettyPhoto.js"></script>
<script src="js/vendor/jquery.easing.1.3.js"></script>
<script src="js/vendor/jquery.ui.totop.js"></script>
<script src="js/vendor/jquery.isotope.min.js"></script>
<script src="js/vendor/jquery.easypiechart.min.js"></script>
<script src='js/vendor/jflickrfeed.min.js'></script>
<script src="js/vendor/jquery.sticky.js"></script>
<script src='js/vendor/owl.carousel.min.js'></script>
<script src='js/vendor/jquery.nicescroll.min.js'></script>
<script src='js/vendor/jquery.fractionslider.min.js'></script>
<script src='js/vendor/jquery.scrollTo-min.js'></script>
<script src='js/vendor/jquery.localscroll-min.js'></script>
<script src='js/vendor/jquery.parallax-1.1.3.js'></script>
<script src='js/vendor/jquery.bxslider.min.js'></script>
<script src='js/vendor/jquery.funnyText.min.js'></script>
<script src='js/vendor/jquery.countTo.js'></script>
<script src="js/vendor/grid.js"></script>
<script src='twitter/jquery.tweet.min.js'></script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
</body>
</html>
