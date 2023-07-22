package com.csqf.zx.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AlipayConfig {
    private String appId = "2021000122664478";
    private String appPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCX1462DhH0GR7eplf4ZVTdvf3W/ZTYvASTA5kO+y1xwSjRNiQe5TJ5v9Z8lNjbM7URkvyqEJ+ywHS+XJUTcIBnJaLRvoXk1GST0u2NBPaeXiIEPE0JQPAncYTka+jPenjB7nqbcTKLzL/a05dgFVHLiVyPZU1cJStAJHpq6pg4jkrs0VYtuJlH59BlW6/+D4L8d8YYJEQEgvx2v6sEHcLmRlsLvatZViy4u2gCrw9WuQIrgBOgaYSNgQrZzm/Cs/cWTAs5OZI+RuiLt/W3DGSDBJzWJ5T4CJwoCqQLCL995tCLX6PF95/TClSYOzjV6FM8u1Yj5GsCEYtDF9u00WfPAgMBAAECggEAXTaO/WQV0Wu6b6ReTLaoKpf/xINXZNXHWRjUVUYM19BkZkp+UhkRq3wBB+m4Vpifh3JceWpLH0jWYiYjvhNKQAfytB/pwlhAhh7uhauOWhofd8os4Ilk5FHj6vXzrarZhvQHgHU1Om0vOf665tkvpWtlzwG5Q9/tdSrvm8L4P37oF9EoBKix4TvbQ53LRL0Vur5k1IDCXa7c3ht3FiNJ1z+9pFU4R21HiwMx2mkEKiafSxN/EZNPgqUAp4R1kxiE9rmr0A6vo1kZOcYmAukg80t1mWiIJmXR5F4aR961iPEYd7yaUBtzMm99ynopmqZQIKpMpE3kvuoFdepbrswCgQKBgQDSmPYpzH6DnGe+n8veizHi25pY1VNsbCrEiUP2PgS6pWkWZBikGMkHRKRO65stFUINEyVCURMnycobr4L0upKcDB/CCgRv7C9L3GAnMWZu8abZg8yD5dRIXyERnVeGxQ8AgqcupJFjODrS1lJ/eq8oHHvOoMgSGCp8cr2fSkLa2QKBgQC4k9XhXC7LCAI0SdtEHvjyFgwB4mrjHAcCWCBmn/R7ll/OyND7Dmz7JldcGJYoe+++xNpsFDjHoGisMlstgbP1/6T3A1zXek1jp0DMlLi38eeOc5vBt6hjZg4uXNYk3xTJnWGM0nXX7behj3Z3wqmMaVT6NZ4Yy0QIc4Dcz0ye5wKBgQCBGiROG36zT/6JbYydMNe0KsvECYLKxMSzFzMCkaJ0iVKS12oDru4N9paDiwvl51JGkaYVsX38tkegEUhGntmhsA0H9vwhYLjd2ItZe39AJAQU9Cc79HjepPKwybQOel9oALBcd6ZpHN9ywNByNdOK02tSkF4WOZpSEEUOkYfKgQKBgFm2kWh+E8hfViLwGwEbRMj16lQoJufIQafkCauX548CYgLyHJFKS7Iuypta3/FBfB/vMnMByS9OSlIYD7Uoq73PyfC906xwJ5leO+K0DqxpibD1hCk+CTx26EGkofk97K6qLjXyPZD8XBrMzjobhalXsRQEZ5mJgsHQ0juBDq7VAoGALXipj2ztdAXzQztpATHfgMtqbgM1c/LsjhuGwaeIXhxDcl9ZgiJ/dGh0ruGlTRbjM9wTc7nXtrhW+OFgtXxfo0tFalYR0XoLikR/JNdqzyaJGSiZ5hugGBlQgZkRI7LEJmuVQjzQRvHda9WA5c2iGGTQ2zZIGLS1AIl+UZxFNkc=";
    private String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoqY1/eByBru8prh+6cV/YSbn0moMmVaKaQPavrTjlC0fCQ+FEvHQ3f6/QKvRROVQ0IMCkx0sHkR8luI3p6I4qdpV1ZUCXea4JVZc9fyJva6jGbh309IQozgz5cru6KuCaSmn6QEuTk9PZafSf+O13FhMt8jvmQNGNx/VcjjDyFzmXPfoqiO/o6bFdVN+y9Ynt4rP2iK1EENIrUNx3EpfkVSU549H5iAKSAp9+9J5/1RgN0NeS6+NrbpCw7plwvtS/XQFX4DL25POHuKQoTMZb6D0xIXEi7qAAALACe4ynuR/k3Y8qvrTwgRPWkgCeU7ZjQRUGKCqTtwZFj2sCiumMQIDAQAB";
    private String notifyUrl = "https://730467ku71.goho.co/alipay/notify";
    private String returnUrl = "https://730467ku71.goho.co/paySuccess";
}